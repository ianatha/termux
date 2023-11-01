package com.termux.terminal;

public interface TerminalSession {
    void updateTerminalSessionClient(TerminalSessionClient client);

    void updateSize(int columns, int rows);

    String getTitle();

    void initializeEmulator(int columns, int rows);

    void write(byte[] data, int offset, int count);

    void write(String data);

    void writeCodePoint(boolean prependEscape, int codePoint);

    TerminalEmulator getEmulator();

    void reset();

    void finishIfRunning();

    void titleChanged(String oldTitle, String newTitle);

    boolean isRunning();

    int getExitStatus();

    void onCopyTextToClipboard(String text);

    void onPasteTextFromClipboard();

    void onBell();

    void onColorsChanged();

    int getPid();

    String getCwd();

    void setSessionName(String name);
    String getSessionName();

    String getHandle();
}
