import java.util.List;
import java.util.ListIterator;

public class NameFilter {
    public static String filterNames(List<String> names){
        StringBuilder result = new StringBuilder();
        ListIterator<String> it = names.listIterator();
        for(int i = 1;;i ++){
            if(!it.hasNext())
                break;
            if(i % 2 != 0) {
                result.append(it.next());
                result.append(", ");
            }
            else
                it.next();
        }
        if ((result.length()>2))
            result.delete(result.length()-2, result.length()-1);
        return result.toString();
    }
}
