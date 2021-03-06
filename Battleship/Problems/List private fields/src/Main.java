import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        ArrayList<String> result = new ArrayList<>();
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();

        for (Field field : fields) {
            int modifier = field.getModifiers();
            if (Modifier.isPrivate(modifier)) {
                result.add(field.getName());
            }
        }
        Collections.sort(result);
        return result;
    }

}