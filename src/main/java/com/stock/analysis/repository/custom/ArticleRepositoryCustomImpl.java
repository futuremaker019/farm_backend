package com.stock.analysis.repository.custom;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.stock.analysis.domain.entity.QArticle;
import com.stock.analysis.dto.ArticleDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;

public class ArticleRepositoryCustomImpl implements ArticleRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public ArticleRepositoryCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public Page<ArticleDto> findArticles(Pageable pageable) {

        return null;
    }
}