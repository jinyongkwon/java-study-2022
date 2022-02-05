package data00;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class WildcardEx01<T> {
    private final TypeToken<List<T>> internalTypeToken = new TypeToken<List<T>>() {
    };

    private void test(Class<?> class1) {
        final TypeToken<List<Foo>> typeTokenWithExtended = new TypeToken<List<Foo>>() {
        };
        final TypeToken byParameter = TypeToken.getParameterized(List.class, class1);
        final Type typeWithoutExtended = internalTypeToken.getType();
        final Type typeWithExtended = typeTokenWithExtended.getType();
        final Type typeWithArgument = byParameter.getType();
        System.out.println(typeWithoutExtended.getTypeName());
        System.out.println(typeWithExtended.getTypeName());
        System.out.println(typeWithArgument.getTypeName());
    }

    public static void main(String[] args) {
        WildcardEx01<List<Foo>> tester = new WildcardEx01<>();
        tester.test(Foo.class);
    }
}

class Foo {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
