package com.socops.model;

/**
 * One card in the card deck shuffle mode.
 *
 * @param id   zero-based index
 * @param text the question text on the card
 */
public record CardItem(int id, String text) {
}
