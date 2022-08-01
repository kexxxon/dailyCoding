import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class wStudy {
    public static void main(String[] args) {

        Set<Set<Integer>> set = new HashSet<>();

        set.add(new HashSet<>() {{
            add(1);
            add(2);
            add(3);
        }});

        set.add(new HashSet<>() {{
            add(4);
            add(5);
            add(6);
        }});

        set.add(new HashSet<>() {{
            add(7);
            add(8);
            add(9);
        }});

//        System.out.println(set);

        // set.iterator()로 Set<Set<Integer>> 타입의 요소를 it로 담아서 iterator로 가져온다
        // 이터레이터 메서드의 반환값을 it에 저장
//        Iterator<Set<Integer>> it1 = set.iterator();

//        while(it1.hasNext()) {
//            // it.next()로 Set<Integer>타입의 요소를 iterator로 담아서 it.text의 iterator로 가져옴
//            // 여기에 .iterator() 메서드로 iterator integer의 iterator를 만들어준다
//            Iterator<Integer> it2 = it.next().iterator();
//
//            while(it2.hasNext()) {
//                System.out.println(it2.next());
//            }
//        }

        // Set<Set<Integer>의 set(컬렉션명)의 '요소'를 읽어옴
        for(Set<Integer> sett : set) {
            // Set<Integer>의 sett(컬렉션명)의 '요소' 읽어옴
            for(Integer intt : sett) {
                System.out.println(intt);
            }
        }
    }
}

