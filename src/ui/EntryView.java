package ui;

import config.Config;
import data.Entry;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.events.*;
import de.ur.mi.oop.graphics.Compound;
import de.ur.mi.oop.graphics.Image;
import de.ur.mi.oop.graphics.Label;
import de.ur.mi.oop.graphics.Rectangle;

public class EntryView implements Config {
    private Entry entry;
    private Compound view;
    private Image image;

    EntryView(float x, float y, float width, float height, Entry entry) {
        view = new Compound(x, y);
        view.setWidth(width);
        view.setHeight(height);
        this.entry = entry;

        Rectangle entryBackground = new Rectangle(x, y, (int) width, PHONEBOOK_ENTRY_HEIGHT, PHONEBOOK_ENTRY_BACKGROUND_COLOR);
        entryBackground.setBorderWeight(0);
        view.add(entryBackground);

        image = new Image(x, y, entry.getImagePath());
        image.setWidth(height);
        image.setHeight(height);
        view.add(image);

        Label nameLabel = new Label(image.getXPos() + image.getWidth() + PHONEBOOK_ENTRY_MARGIN + (PHONEBOOK_ENTRY_HEIGHT /5), view.getYPos() + (PHONEBOOK_ENTRY_HEIGHT /3), entry.getName());
        nameLabel.setColor(new Color(0, 0, 0, 0));
        nameLabel.setFontSize(PHONEBOOK_ENTRY_HEIGHT /4);
        view.add(nameLabel);

        Label numberLabel = new Label(image.getXPos() + image.getWidth() + PHONEBOOK_ENTRY_MARGIN + (PHONEBOOK_ENTRY_HEIGHT /5), (float) (view.getYPos() + (PHONEBOOK_ENTRY_HEIGHT / 1.4)), entry.getFullNumber());
        numberLabel.setColor(new Color(0, 0, 0, 0));
        numberLabel.setFontSize(PHONEBOOK_ENTRY_HEIGHT /5);
        view.add(numberLabel);
    }

    public Entry getEntry() {
        return this.entry;
    }

    public Compound getView() {
        return this.view;
    }

    public void resetAppearance() {
        view.getObjectAt(image.getXPos() + image.getWidth() + PHONEBOOK_ENTRY_MARGIN + (PHONEBOOK_ENTRY_HEIGHT /5), view.getYPos() + (PHONEBOOK_ENTRY_HEIGHT /3)).setColor(new Color(0, 0, 0, 0));
        view.getObjectAt(image.getXPos() + image.getWidth() + PHONEBOOK_ENTRY_MARGIN + (PHONEBOOK_ENTRY_HEIGHT /5), (float) (view.getYPos() + (PHONEBOOK_ENTRY_HEIGHT / 1.4))).setColor(new Color(0, 0, 0, 0));
    }

    public void changeAppearance() {
        view.getObjectAt(image.getXPos() + image.getWidth() + PHONEBOOK_ENTRY_MARGIN + (PHONEBOOK_ENTRY_HEIGHT /5), view.getYPos() + (PHONEBOOK_ENTRY_HEIGHT /3)).setColor(PHONEBOOK_FONT_COLOR);
        view.getObjectAt(image.getXPos() + image.getWidth() + PHONEBOOK_ENTRY_MARGIN + (PHONEBOOK_ENTRY_HEIGHT /5), (float) (view.getYPos() + (PHONEBOOK_ENTRY_HEIGHT / 1.4))).setColor(PHONEBOOK_FONT_COLOR);
    }
}
