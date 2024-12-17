void main() {
    Stream.iterate(1, i -> i + 1)
//            .parallel()
            .limit(100)
            .map(i -> {
                System.out.println("map: " + i);
                return i;
            })
            .filter(i -> i % 2 == 0)
            .forEach(System.out::println);
    
//            .filter(i -> i % 2 == 0);

//            .filter(i -> i % 2 == 0)
//            .findAny()
//            .ifPresent(System.out::println);
}