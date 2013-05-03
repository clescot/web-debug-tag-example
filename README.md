web-debug-tag-example
=====================

This project illustrate usage of the [web-debug-tag](https://github.com/figarocms/web-debug-tag) , in support of [an article (in french)](http://clescot.com/blog/2013/05/03/web-debug-tag-comment-visualiser-facilement-les-variables-disponibles-dans-les-jsp).



to visualize the [web-debug-tag](https://github.com/figarocms/web-debug-tag) in action :

- install [git](http://git-scm.com) if it's not already done
- clone this repository


    git clone https://github.com/clescot/web-debug-tag-example


- run this maven command at the root of the newly created web-debug-tag-example directory,  to execute a jetty server with the demo webapp:



    mvn org.eclipse.jetty:jetty-maven-plugin:9.0.2.v20130417:run-exploded


and point your browser to the [web app url](http://127.0.0.1:8080/web-debug-tag-example).

Then, hit the `F12` key on firefox to activate [the firebug plugin](https://addons.mozilla.org/fr/firefox/addon/firebug/),
or `ctrl+shift+j` on chrome, to display the console output.

