package com.algorithm.arrayalgorithm.arrayfunctions;

import java.util.*;

public class ArrayUtils {


//    Cac Functions co ban
    public static ArrayList<Integer> inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập " + n + " phần tử: ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        return arr;
    }

    public static void printArray(ArrayList<Integer> arr) {
        System.out.print("Mảng: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> sortArray(ArrayList<Integer> arr) {
        ArrayList<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr);
        return sortedArr;
    }

    public static int findMax(ArrayList<Integer> arr) {
        return Collections.max(arr);
    }

    public static int findMin(ArrayList<Integer> arr) {
        return Collections.min(arr);
    }

    public static int calculateSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

//    Cac function lien quan dem tim kiem

    public static int searchElement(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void findAndCountDuplicates(ArrayList<Integer> arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi phần tử trong danh sách
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // In ra các phần tử có số lần xuất hiện lớn hơn 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
            }
        }
    }

    public static void removeDuplicates(ArrayList<Integer> arr) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (visited.containsKey(element)) {
                iterator.remove();
            } else {
                visited.put(element, true);
            }
        }
    }



    public static int countOccurrences(ArrayList<Integer> arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<ArrayList<Integer>> convertTo2D(ArrayList<Integer> arr, int rows, int cols) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(arr.get(i * cols + j));
            }
            result.add(row);
        }
        return result;
    }

//    Cac thuat toan

//    Thuat toan KADANE
//
//          Thuật toán Kadane thường được sử dụng trong các vấn đề liên quan đến xử lý dãy số, đặc biệt là khi bạn cần tìm kiếm dãy con có tổng lớn nhất.


//    Các bài toán thường áp dụng thuật toán Kadane:
//      Tìm tổng con lớn nhất trong một dãy số: Đây là trường hợp cơ bản và phổ biến nhất.
//
//      Tìm dãy con lớn nhất trong một mảng: Trong trường hợp này, bạn muốn biết vị trí bắt đầu và kết thúc của dãy con lớn nhất.
//
//      Tìm dãy con không âm lớn nhất trong mảng: Cái này tương tự như bài toán cơ bản, nhưng yêu cầu loại bỏ dãy con âm nếu tổng của chúng âm.
//
//      Tìm hai chỉ số i và j sao cho tổng của dãy con a[i:j] lớn nhất.
//
//      Tìm một dãy con không trùng lặp (distinct elements) lớn nhất trong mảng.




    public static void main(String[] args) {
        System.out.print("Moi ban nhap so phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = inputArray(n);
        printArray(arr);
        System.out.println("Phần tử lớn nhất: " + findMax(arr));
        System.out.println("Phần tử nhỏ nhất: " + findMin(arr));
        System.out.println("Tổng các phần tử: " + calculateSum(arr));
    }

}
