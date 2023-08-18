package com.jsh.boardadminproject.dto;

import java.time.LocalDateTime;
import java.util.Set;

public record ArticleDto(
    Long id,
    UserAccountDto userAccount,
    String title,
    String content,
    Set<String> hashtags,
    LocalDateTime createdAt,
    String createdBy,
    LocalDateTime modifiedAt,
    String ModifiedBy
) {

    public static ArticleDto of(Long id, UserAccountDto userAccount, String title, String content, Set<String> hashtags, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String ModifiedBy) {
       return new ArticleDto(id, userAccount, title, content, hashtags, createdAt, createdBy, modifiedAt, ModifiedBy);
    }
}
