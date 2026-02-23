package com.socops.model;

/**
 * One item on the scavenger hunt checklist.
 *
 * @param id   zero-based index
 * @param text the quest prompt text
 */
public record ScavengerItem(int id, String text) {
}
