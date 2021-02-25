import java.lang.reflect.Field;
import java.lang.reflect.*;
import java.util.ArrayList;

/**
 * Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        ArrayList<String> list = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isPublic(field.getModifiers())) {
                list.add(field.getName());
            }
        }
        return list.toArray(new String[0]);
    }
}