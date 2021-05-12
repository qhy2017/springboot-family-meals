package qhy.example.web.controller;

import com.alibaba.fastjson.JSON;
import javafx.application.Application;
import javafx.stage.Stage;

public class Test  {


    public static void main(String[] args)


    {

        int[][] arr = new int[][]{{1,2,3},{3,4}};
//
//        for(int i=0; i < arr.length; i++){
//
//            for(int j = 0; j < arr[i].length; j++){
//
//                System.out.print(arr[i][j] + "----");
//            }
//
//            System.out.println();
//        }

        arr = reverse(arr);
        for(int i = 0;i< arr.length;i++) {
            StringBuffer td = new StringBuffer();
            for (int j=0;j< arr[i].length;j++){
                td.append("<td>"+ arr[i][j] +"</td>");
                System.out.print(arr[i][j] + "----");
            };
            System.out.println(td.toString());
        }
        System.out.println(JSON.toJSONString(arr));
        printArray(arr);
    }


    /**
     * 二维数组转置
     * @param arry
     */
    public static int[][]  reverse(int arry[][]) {
        int[][] resultArr = new int[arry[0].length][arry.length];
        for(int i = 0;i < arry.length;i++) {
            for(int j = 0;j < arry[i].length;j++) {
                resultArr[j][i] = arry[i][j];
            }
        }
        return resultArr;
    }

    public static void printArray(int array[][]){
        for(int i=0;i<array.length; i++) {
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j]+"、");
            }
            System.out.println();
        }
    }
}
