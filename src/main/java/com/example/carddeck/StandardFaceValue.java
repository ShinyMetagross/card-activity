package com.example.carddeck;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class StandardFaceValue implements FaceValue, Comparable<StandardFaceValue>
{
    public static final FaceValue ACE = new StandardFaceValue("Ace", 1);
    public static final FaceValue TWO = new StandardFaceValue("Two", 2);
    public static final FaceValue THREE = new StandardFaceValue("Three", 3);
    public static final FaceValue FOUR = new StandardFaceValue("Four", 4);
    public static final FaceValue FIVE = new StandardFaceValue("Five", 5);
    public static final FaceValue SIX = new StandardFaceValue("Six", 6);
    public static final FaceValue SEVEN = new StandardFaceValue("Seven", 7);
    public static final FaceValue EIGHT = new StandardFaceValue("Eight", 8);
    public static final FaceValue NINE = new StandardFaceValue("Nine", 9);
    public static final FaceValue TEN = new StandardFaceValue("Ten", 10);
    public static final FaceValue JACK = new StandardFaceValue("Jack", 11);
    public static final FaceValue QUEEN = new StandardFaceValue("Queen", 12);
    public static final FaceValue KING = new StandardFaceValue("King", 13);

    private final String name;
    private final int ordinal;

    public StandardFaceValue(String name, int ordinal)
    {
        this.name = name;
        this.ordinal = ordinal;
    }

    public static Set<FaceValue> values()
    {
        Set<FaceValue> set = new TreeSet<>();
        Field[] fields = StandardFaceValue.class.getFields();
        for(Field field : fields)
        {
            if(Modifier.isStatic(field.getModifiers()))
            {
                try {
                    set.add((StandardFaceValue) field.get(null));
                } catch(IllegalAccessException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return set;
    }

    public int ordinal()
    {
        return ordinal;
    }

    @Override
    public String toString()
    {
        return name;
    }

    public int compareTo(StandardFaceValue that)
    {
        if(this.ordinal > that.ordinal)
            return 1;
        else if(this.ordinal < that.ordinal)
            return -1;
        else
            return 0;
    }
}
