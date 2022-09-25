import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();

        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Посетитель " + person.getName() + " прокатился");
            person.spendTicket();
            if (person.hasMoreTickets()) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> ans = new ArrayList<>();
        ans.add(new Person("Ivan", "Ivanov", 4));
        ans.add(new Person("Petr", "Petrov", 2));
        ans.add(new Person("Ekaterina", "Petrova", 5));
        ans.add(new Person("Olga", "Ivanova", 3));
        ans.add(new Person("Anna", "Petrova", 1));
        return ans;
    }

}
