package POJOComun;

import java.util.LinkedList;
import java.util.List;

public class Outsider {
    public static void main(String[] args) {
        List<String> sierEmail = new LinkedList<>();
        sierEmail.add("sier@sier.com");

        MutablePerson sier = new MutablePerson();
        sier.setEmails(sierEmail);
        sier.setFirstName("Israel");
        sier.setLastName("Sergio");

    }
}
