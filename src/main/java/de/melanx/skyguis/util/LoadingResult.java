package de.melanx.skyguis.util;

import net.minecraft.network.chat.Component;

public record LoadingResult(LoadingResult.Status status, Component reason) {

    public enum Status {
        SUCCESS,
        FAIL
    }
}
