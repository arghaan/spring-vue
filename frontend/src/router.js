import Vue from 'vue'
import Router from 'vue-router'
// noinspection NpmUsedModulesInstalled
import HelloWorld from '@/components/HelloWorld'
// noinspection NpmUsedModulesInstalled
import Greeting from '@/components/Greeting'

Vue.use(Router);

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'Greeting',
            component: Greeting
        },
        {
            path: '/hello-world',
            name: 'HelloWorld',
            component: HelloWorld
        }
    ]
})