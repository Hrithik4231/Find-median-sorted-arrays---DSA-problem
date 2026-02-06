// import java.util.HashMap;
// // import java.util.Map;
// import java.util.HashSet;

// class Main{
    
//     public static void main(String[] args){

//         int[] arr = {1, 2, 3, 2, 1, 4, 5, 3, 6};
//         HashMap<Integer, Integer> frequencyMap = new HashMap<>();

//         for(int num : arr){
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }
//         System.out.println("Element Frequencies:");

//         for (int key : frequencyMap.keySet()) {
//             System.out.println(key + " = " + frequencyMap.get(key));
//             if(frequencyMap.get(key) == 1){
//                 System.out.println("Found first non-repeating element: " + key);
//                 break;
//             }
//         }

//         HashSet<Integer> removeduplicate = new HashSet<>();
//             for(int num : arr){
//                 removeduplicate.add(num);
//                 System.out.println("Set after removing duplicates:" + removeduplicate);
//             }
    
//     }
// }

// class Student {
//     int marks;

//     Student(int marks) {
//         this.marks = marks;
//     }

//     boolean isPass() {
//         return marks >= 35;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Student s = new Student(70);
//         System.out.println(s.isPass());
//     }
// }


class Main{
    public static void main(String[] args){
        int[] nums = {1,3,5,7,9};
        System.out.println(nums.length);
    }
}