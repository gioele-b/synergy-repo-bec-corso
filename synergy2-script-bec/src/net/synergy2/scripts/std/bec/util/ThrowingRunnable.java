package net.synergy2.scripts.std.bec.util;

@FunctionalInterface
public interface ThrowingRunnable {
    void run() throws Exception;
}
