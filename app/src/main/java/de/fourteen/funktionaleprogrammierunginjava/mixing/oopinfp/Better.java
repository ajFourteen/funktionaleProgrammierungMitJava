void main() {
    Function<String, Integer> stringToNumber = string -> switch (string) {
        case "One" -> 1;
        case "Two" -> 2;
        case "Three" -> 3;
        default -> null;
    };

    Stream.of("One", "Two", "Three")
            .map(stringToNumber)
            .forEach(System.out::println);
}