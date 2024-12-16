void main() {
    Function<Integer, Function<Integer, Integer>> sum =
            (Integer a) -> (Integer b) -> a + b;

    int answerToTheUltimateQuestionOfLifeTheUniverseAndEverything =
            sum.apply(40).apply(2);
}

