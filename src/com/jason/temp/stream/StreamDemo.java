package com.jason.temp.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    static void  gen1(){
        String[] strs = {"11","22","33"};
        Stream<String> stream1 = Stream.of(strs);
        stream1.forEach(System.out::println);
    }

    static void gen2(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);
    }

    //generate
    static void gen3(){
        Stream<String> generate = Stream.generate(() -> "generate");//无限
        generate.limit(10).forEach(System.out::println);
    }

    //iterator
    static void gen4(){
        Stream<Integer> iterate = Stream.iterate(1, (x)->x+1);
        iterate.limit(100).forEach(System.out::println);
    }

    static void gen5(){
        String str = "abcdefg";
        IntStream intStream = str.chars();
        intStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();
        //过滤
        Arrays.asList(1,2,3,4,5).stream().filter((x)->x%2==0).forEach(System.out::println);
        //过滤求和
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
        //求最大值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        System.out.println(max.get());
        //最小值
        System.out.println(list.stream().min((a,b)-> a-b).get());

        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(any.get());

        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());
        // 中间操作，终止操作
        // 不执行终止操作的时候不执行
        System.out.println("######################");
        //不用min、max 找到最大最小值，先排序再取第一个
        System.out.println(list.stream().sorted().findFirst().get());
        System.out.println(list.stream().sorted((a, b) -> b - a).findFirst().get());

        Arrays.asList("1","22","333","666","4444","55555").stream().sorted().forEach(System.out::println);
        System.out.println("######################");
        Arrays.asList("1","22","333","666666","4444","55555").stream().sorted((a,b)->a.length() - b.length()).forEach(System.out::println);

        //先过滤再返回对象
        System.out.println("######################");
        List<String> collect = Arrays.asList("1", "22", "333", "666666", "4444", "55555").stream().filter((a) -> a.length() % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
        //去重
        System.out.println("######################");
        Arrays.asList(1,2,3,1,1,1,2,2,4,5,5,7,7,7).stream().distinct().forEach(System.out::println);
        System.out.println("######################");
        Arrays.asList(1,2,3,1,1,1,2,2,4,5,5,7,7,7).stream().collect(Collectors.toSet()).forEach(System.out::println);
        //打印20-30
        System.out.println("######################");
        Stream.iterate(1, x->x+1).limit(30).skip(19).forEach(System.out::println);
        System.out.println("######################");
        String str = "11,2,2,33,4,5,6,";
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());
        System.out.println("######################");
        //
        String str2 = "zhangsan,lisi,wangwu";
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        System.out.println("######################");
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        System.out.println("######################");
        Stream.of(str2.split(",")).map(x->Person.build(x)).forEach(System.out::println);
        System.out.println("######################");
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);

        //str 打印并求和
        System.out.println("######################");
        System.out.println(Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());
        System.out.println("######################");
        System.out.println(list.stream().allMatch(x -> x > 0));//所有满足
        System.out.println("######################");
        List<String> stringList = Stream.of(str2.split(",")).map(x -> x.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}
