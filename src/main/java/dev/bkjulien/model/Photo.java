package dev.bkjulien.model;

public record Photo(
        Integer photoId,
        Integer albumId,
        String title,
        String url,
        String thumbnailUrl
) {
}
