package comporator;

import java.util.Comparator;

public class MessageComparator implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
        return o2.getMessage().compareTo(o1.getMessage());
    }
}
