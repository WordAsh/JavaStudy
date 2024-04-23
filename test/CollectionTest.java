import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void test1(){
        ArrayList<String> arrayList1 = new ArrayList();
        arrayList1.add("Tom");
        arrayList1.add("Python");
        arrayList1.add(1,"Java");
        arrayList1.set(0,"Golang");
        System.out.println(arrayList1);

        System.out.println("arrayList1.get(1) = " + arrayList1.get(1));
        System.out.println("arrayList1.size() = " + arrayList1.size());
        System.out.println("arrayList1.isEmpty() = " + arrayList1.isEmpty());

        Collections.reverse(arrayList1);
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("arrayList1.subList(1,2) = " + arrayList1.subList(1, 2));
    }

    @Test
    public void test2(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.push(13);
        linkedList.addLast(45);

        Iterator<Integer> iterator =linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }

    @Test
    public void test3(){
        HashSet<String> hashSet = new HashSet();
        hashSet.add("Jim");
        hashSet.add("Tom");
        hashSet.add("Alen");
        System.out.println("hashSet = " + hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Frank");
        linkedHashSet.add("Barry");
        linkedHashSet.add("Sara");
        System.out.println("linkedHashSet = " + linkedHashSet);
    }

    @Test
    public void test4(){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(188,"Rigon");
        hashMap.put(189,"MiaoMiao");
        hashMap.put(186,"Qiang");
        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.get(188) = " + hashMap.get(188));
        System.out.println("hashMap.remove(186) = " + hashMap.remove(186));
        System.out.println("hashMap.containsKey(188) = " + hashMap.containsKey(188));
        System.out.println("hashMap.containsValue(\"Rigon\") = " + hashMap.containsValue("Rigon"));
        hashMap.replace(189,"CloudSoft");
        System.out.println("hashMap = " + hashMap);

        Set<Integer> keys = hashMap.keySet();
        System.out.println("keys = " + keys);

        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
        System.out.println("entrySet = " + entrySet);

        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next().getValue() = " + iterator.next().getValue());
        }
    }
}
