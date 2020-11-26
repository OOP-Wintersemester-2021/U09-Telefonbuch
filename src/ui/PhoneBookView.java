package ui;

import config.Config;
import data.Entry;
import data.PhoneBook;

import java.util.ArrayList;

public class PhoneBookView implements Config {

    private PhoneBook book;
    private ArrayList<EntryView> currentEntries;
    private int xPos;
    private int yPos;
    private int width;

    public PhoneBookView(int x, int y, int width, PhoneBook book) {
        this.xPos = x;
        this.yPos = y;
        this.width = width;
        this.book = book;
        this.currentEntries = new ArrayList<EntryView>();

        ArrayList<Entry> entries = book.getEntries();

        for (int i = 0; i < entries.size(); i++) {
            addEntry(entries.get(i), i);
        }
    }

    public void draw() {
        for (EntryView entry : currentEntries) {
            entry.getView().draw();
        }
    }

    private void addEntry(Entry entry, int position) {
        float x = xPos;
        float y = yPos + PHONEBOOK_ENTRY_MARGIN + ((PHONEBOOK_ENTRY_HEIGHT + PHONEBOOK_ENTRY_MARGIN) * position);

        this.currentEntries.add(new EntryView(x, y, width, PHONEBOOK_ENTRY_HEIGHT, entry));
    }

    public void onClick(int x, int y) {
        for(EntryView entryView: this.currentEntries) {
            if(entryView.getView().hitTest(x, y)) {
                entryView.changeAppearance();
            } else {
                entryView.resetAppearance();
            }
        }
    }
}