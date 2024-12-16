void main() {
    Map<String, Integer> map = new HashMap<>() {{
        put("One", 1);
        put("Two", 2);
    }};

    Runnable oneTwoThree = () -> Stream.of("One", "Two", "Three")
            .map(map::get)
            .forEach(System.out::println);

    oneTwoThree.run();
    map.put("Three", 3);
    oneTwoThree.run();
}
