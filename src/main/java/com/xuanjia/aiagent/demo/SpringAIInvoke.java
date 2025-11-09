package com.xuanjia.aiagent.demo;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class SpringAIInvoke implements CommandLineRunner {

    @Resource
    private ChatModel dashscopeClientChatModel;
    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = dashscopeClientChatModel.call(new Prompt("你好，我是学习Spring AI 的新人宣佳！"))
                .getResult()
                .getOutput();
        System.out.println(output);
    }
}
