package edu.dio.lesson6;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by vladimirkr on 08.05.2014.
 */
public class ArrayWrapper {

    public static <T> T[]  merge(T[] array1, T[] array2) {
        HashSet<T> hashSet=new HashSet<T>();
        hashSet.addAll(Arrays.asList(array1));
        hashSet.addAll(Arrays.asList(array2));

        Class<T> probe = array1 == null || array1.length == 0? null : (Class<T>) array1[0].getClass();
        T[] out = (T[]) Array.newInstance(probe, hashSet.size());

        return hashSet.toArray(out);
    }
    
}
