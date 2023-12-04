class Acronym {

    static String abbreviate(String phrase) {
        phrase.replaceAll("[-_,.!?]", " ")
            .split("[ ]")
            .findAll {!it.trim().isEmpty()}
            .collect { it.charAt(0).toUpperCase() }
            .join()
    }
}