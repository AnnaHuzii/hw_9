package TaskTwo;

import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class GsonNamesYear {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\AnnaHuzii\\обучение java\\DZ\\hw_9\\src\\main\\java\\TaskTwo\\file.txt");
        File user = new File("C:\\AnnaHuzii\\обучение java\\DZ\\hw_9\\src\\main\\java\\TaskTwo\\user.json");
        BufferedReader fin = new BufferedReader(new FileReader(file));
        String line;
        String json;
        FileWriter writer = new FileWriter(user);
        while ((line = fin.readLine()) != null) {
            String[] words = line.split(" ");
            String name = words[0];
            String ageString = words[1];
            int age = Integer.parseInt(ageString.trim());

            Person person = new Person(name, age);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            json = gson.toJson(person);
            writer.write(json);
        }
        writer.flush();

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


