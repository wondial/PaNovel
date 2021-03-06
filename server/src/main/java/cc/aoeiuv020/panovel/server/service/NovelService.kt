package cc.aoeiuv020.panovel.server.service

import cc.aoeiuv020.panovel.server.dal.model.autogen.Novel

/**
 *
 * Created by AoEiuV020 on 2018.04.05-09:13:02.
 */
interface NovelService {
    fun uploadUpdate(novel: Novel): Boolean
    fun needRefreshNovelList(count: Int): List<Novel>
    fun query(novel: Novel): Novel
    fun touch(novel: Novel): Boolean
}