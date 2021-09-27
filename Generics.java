public class Generics {
    public static void main(String[] args) {
        
        var genArrayOne = new GenericArray<>(new Integer[] {1,2,3});
        int[] x = new int[]{1,2,3};
        int[] y = {4,5,6};
        System.out.println(x.getClass().getSimpleName());
        //var genArrayTwo = new GenericArray<>({4,5,6});
        //Above gives an error because the compiler infers the type parameter to be int and only reference types
        //can be used as type parameters for generic methods or classes
        System.out.println(genArrayOne.getClass().getSimpleName());
        var randomGenTypeObj = new RandomGenericType<>();
        System.out.println(randomGenTypeObj.getClass().getSimpleName());
        System.out.println(randomGenTypeObj.getTypeParamValue());
    }
}


class GenericArray<T> {

    private T[] t;

    public GenericArray(T[] t) {
        this.t = t.clone();
    }

    public T get(int index) {
        return t[index];
    }
}

class RandomGenericType<T> {

    private T t;

    public void setTypeParamValue(T t) {
        this.t = t;
    }

    public T getTypeParamValue() {
        return this.t;
    }
}