package com.projeto.mmorpg.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projeto.mmorpg.model.Quest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestService {

    private List<Quest> quests = new ArrayList<>();

    public QuestService() {
        // Carregar quests do arquivo JSON
        loadQuestsFromJson();
    }

    private void loadQuestsFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Usando ClassPathResource para acessar o arquivo dentro de src/main/resources
            InputStream inputStream = new ClassPathResource("quests.json").getInputStream();
            quests = objectMapper.readValue(inputStream, new TypeReference<List<Quest>>() {
            });
            System.out.println("Quests carregadas: " + quests.size());
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para obter todas as quests
    public List<Quest> getAllQuests() {
        return quests;
    }

    // Método para obter todas as dicas
    public List<String> getAllHints() {
        List<String> hints = new ArrayList<>();
        for (Quest quest : quests) {
            hints.add(quest.getHint());
        }
        return hints;
    }

    // Método para obter uma quest por ID
    public Quest getQuestById(String id) {
        for (Quest quest : quests) {
            if (quest.getId().equals(id)) {
                return quest;
            }
        }
        return null; // Retorna null se não encontrar a quest
    }

    // Método para adicionar uma nova quest
    public String addQuest(Quest quest) {
        quests.add(quest);
        return "Quest adicionada com sucesso!";
    }
}
