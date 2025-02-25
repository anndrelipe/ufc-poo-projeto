package ufc_poo_projeto.app.entities;

public enum Genero {
    MASCULINO,
    FEMININO,
    OUTRO;

    public static Genero fromString(String genero) {
        if (genero != null || !genero.trim().isEmpty()) {
            for (Genero g : Genero.values()) {
                if (g.name().equalsIgnoreCase(genero)) {
                    return g;
                }
            }
            return OUTRO;
        }
        throw new IllegalArgumentException("Gênero inválido: " + genero);
    }
}
