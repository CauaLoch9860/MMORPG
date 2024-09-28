package com.projeto.mmorpg.controller;

import org.springframework.web.bind.annotation.PathVariable;
import com.projeto.mmorpg.model.Quest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.projeto.mmorpg.service.QuestService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class QuestController {

    private final QuestService questService;

    @Autowired
    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    // Endpoint para obter todas as quests
    @GetMapping("/quests")
    public List<Quest> getQuests() {
        return questService.getAllQuests();
    }

    // Endpoint para obter as dicas de todas as quests
    @GetMapping("/quests/hints")
    public List<String> getHints() {
        return questService.getAllHints();
    }

    // Endpoint para obter a dica de uma quest específica por ID
    @GetMapping("/quests/{id}/hint")
    public String getHintByQuestId(@PathVariable String id) {
        Quest quest = questService.getQuestById(id);
        return (quest != null) ? quest.getHint() : "Quest não encontrada.";
    }

    // Endpoint para adicionar uma nova quest
    @PostMapping("/quests")
    public String addQuest(@RequestBody Quest quest) {
        return questService.addQuest(quest);
    }

    // Endpoint para retornar informações sobre o projeto
    @GetMapping("/sobre")
    public Map<String, String> getAbout() {
        Map<String, String> aboutInfo = new HashMap<>();
        aboutInfo.put("estudante", "Cauã Loch Fernandes");
        aboutInfo.put("projeto", "MMORPG");
        return aboutInfo;
    }
}
