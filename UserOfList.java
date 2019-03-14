/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add(2);
        list.add("hello");
        list.add(7.89);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "list " + list);

        list.add(0);
        list.add(true);
        list.add(false);
        list.add("hello world");
        list.add(9.12222);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "list " + list);

        list.add( 1);
        list.add(-1);
        list.add("is this working?");
        list.add("should expand");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "list " + list);

        // // Add enough elements that expansion is expected
        // for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

            // if( list.size() == 10) System.out.println( "expansion expected");

            // list.add( 0, -elemIndex, -2.0,  "junk");
            // System.out.println( "number of elements: " + list.size() );
        // }
        // System.out.println("result of expanded list: "
             // + list.size() + " elements:");
        // System.out.println( list + System.lineSeparator());
    }
}
