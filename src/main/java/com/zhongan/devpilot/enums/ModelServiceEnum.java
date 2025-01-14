package com.zhongan.devpilot.enums;

public enum ModelServiceEnum {
    OPENAI("OpenAI", "OpenAI Service"),
    LLAMA("LLaMA", "Code LLaMA (Locally)"),
    AIGATEWAY("AIGateway", "AI Gateway");

    // model name
    private final String name;

    // model display name
    private final String displayName;

    ModelServiceEnum(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public static ModelServiceEnum fromName(String name) {
        if (name == null) {
            return null;
        }
        for (ModelServiceEnum type : ModelServiceEnum.values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
