package com.projeto.mmorpg.model;

public class Quest {
    private String id;
    private String title;
    private String description;
    private String hint; // Se preferir, você pode manter o hint como atributo da quest.

    // Construtor
    public Quest(String id, String title, String description, String hint) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.hint = hint; // Aqui, você pode usar o hint como atributo da quest.
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getHint() {
        return hint;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
