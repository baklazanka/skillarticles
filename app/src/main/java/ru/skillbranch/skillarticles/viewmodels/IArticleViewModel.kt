package ru.skillbranch.skillarticles.viewmodels

import androidx.lifecycle.LiveData
import ru.skillbranch.skillarticles.data.ArticleData
import ru.skillbranch.skillarticles.data.ArticlePersonalInfo

interface IArticleViewModel {

    /**
     * Получение полной информации о статье из сети
     * (или базы данных, если она сохранена, наличие статьи в базе не надо реализовывать в данном уроке)
     */
    fun getArticleContent(): LiveData<List<Any>?>

    /**
     * Получение краткой информации о статье из базы данных
     */
    fun getArticleData(): LiveData<ArticleData?>

    /**
     * Получение пользовательской информации о статье из базы данных
     */
    fun getArticlePersonalInfo(): LiveData<ArticlePersonalInfo?>

    /**
     * Получение настроек приложения
     */
    fun handleNightMode()

    /**
     * Обработка нажатия на btn_text_up (увеличение шрифта текста)
     * необходимо увеличить шрифт до значения 18
     */
    fun handleUpText()

    /**
     * Обработка нажатия на btn_text_down (стандартный размер шрифта)
     * необходимо установить размер шрифта по умолчанию 14
     */
    fun handleDownText()

    /**
     * добавление/удаление статьи в закладки, обработка нажатия на кнопку btn_bookmark
     * необходимо отобразить сообщение пользователю "Add to bookmarks" или "Remove from bookmarks"
     * в соответствии с текущим состоянием
     */
    fun handleBookmark()

    /**
     * добавление/удаление статьи в понравившееся, обработка нажатия на кнопку btn_like
     * необходимо отобразить сообщение пользователю (Notify.ActionMessage) "Mark is liked" или
     * "Don`t like it anymore"  в соответствии с текущим состоянием.
     * если пользователь убрал Like, необходимо добавить  actionLabel в снекбар
     * "No, still like it", при нажатиии на который состояние вернется к isLike = true
     */
    fun handleLike()

    /**
     * поделиться статьей, обработка нажатия на кнопку btn_share
     * необходимо отобразить сообщение с ошибкой пользователю (Notify.ErrorMessage) "Share is not implemented"
     * и текстом errLabel "OK"
     */
    fun handleShare()

    /**
     * обработка нажатия на кнопку btn_settings
     * необходимо отобразить или скрыть меню в соответствии с текущим состоянием
     */
    fun handleToggleMenu()

    /**
     * обработка перехода в режим поиска searchView
     * при нажатии на пункт меню тулбара необходимо отобразить searchView и сохранить состояние при
     * изменении конфигурации (пересоздании активити)
     */
    fun handleSearchMode(isSearch: Boolean)

    /**
     * обработка поискового запроса, необходимо сохранить поисковый запрос и отображать его в
     * searchView при изменении конфигурации (пересоздании активити)
     */
    fun handleSearch(query: String?)

}