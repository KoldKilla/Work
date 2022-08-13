# Тестовое задание для вакансии стажёр-автоматизатор. Демидов К.С.

## 1. Вопрос: Можно ли послать GET запрос с body. Что произойдет если да, если нет то почему
Ответ: 
Можно, т.к HTTP стандарт не запрещает этого делать, но из самого браузера сделать GET-запрос с телом сделать невозможно, т.к этот запрос будет либо игнорироваться, либо запрос будет отклонён. (Ошибка TypeError или InvalidStateError). В отдельных спецификациях указано, что тело запроса необходимо вообще игнорировать. Возьмём к примеру Swagger, если вспомнить поведение данного фреймворка, то он никогда в жизни не отправит body-запрос в GET.

Из спецификации XMLHttpRequest:
1. Initiates the request. The optional argument provides the request entity body. The argument is ignored if request method is GET or HEAD. Throws an "InvalidStateError" exception if the state is not OPENED or if the send() flag is set.

Из спецификации Fetch Standart:
1. If either init’s body member is present and is non-null or inputBody is non-null, and request’s method is GET or HEAD, then throw a TypeError.


## 2. Не открывается сайт приложения. Задача : описать ваши действия в сложившейся ситуации.
Ответ:
Если сайт не открывается, то первым делом я зайду в DevTools, в консоль и посмотрю какой код состояния отдаёт сервер клиенту. Если же в консоли ошибка не отображается, то я зайду во вкладку Network и буду смотреть ответы от бэка и фронта, т.к может ошибка скрываться там. Все данные проверки я провёл бы на нескольких браузерах, чтобы убедиться, что проблема не с моей стороны. После того, как я бы убедился, что ошибка не с моей стороны, то написал бы сообщение разработчику, которое содержало бы вопрос почему сайт не работает, сколько времени это займёт и необходимо ли для этого создавать задачу или же он исправит этот баг без задачи.
