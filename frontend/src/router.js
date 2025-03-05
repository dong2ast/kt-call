
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReportReportManager from "./components/listers/ReportReportCards"
import ReportReportDetail from "./components/listers/ReportReportDetail"

import MgmtMgmtManager from "./components/listers/MgmtMgmtCards"
import MgmtMgmtDetail from "./components/listers/MgmtMgmtDetail"

import ReportDetailView from "./components/ReportDetailView"
import ReportDetailViewDetail from "./components/ReportDetailViewDetail"
import NotificationNotificationHistoryManager from "./components/listers/NotificationNotificationHistoryCards"
import NotificationNotificationHistoryDetail from "./components/listers/NotificationNotificationHistoryDetail"

import NotificationListView from "./components/NotificationListView"
import NotificationListViewDetail from "./components/NotificationListViewDetail"
import PhonePhoneManager from "./components/listers/PhonePhoneCards"
import PhonePhoneDetail from "./components/listers/PhonePhoneDetail"

import SearchPhoneView from "./components/SearchPhoneView"
import SearchPhoneViewDetail from "./components/SearchPhoneViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reports/reports',
                name: 'ReportReportManager',
                component: ReportReportManager
            },
            {
                path: '/reports/reports/:id',
                name: 'ReportReportDetail',
                component: ReportReportDetail
            },

            {
                path: '/mgmts/mgmts',
                name: 'MgmtMgmtManager',
                component: MgmtMgmtManager
            },
            {
                path: '/mgmts/mgmts/:id',
                name: 'MgmtMgmtDetail',
                component: MgmtMgmtDetail
            },

            {
                path: '/mgmts/reportDetails',
                name: 'ReportDetailView',
                component: ReportDetailView
            },
            {
                path: '/mgmts/reportDetails/:id',
                name: 'ReportDetailViewDetail',
                component: ReportDetailViewDetail
            },
            {
                path: '/notifications/notificationHistories',
                name: 'NotificationNotificationHistoryManager',
                component: NotificationNotificationHistoryManager
            },
            {
                path: '/notifications/notificationHistories/:id',
                name: 'NotificationNotificationHistoryDetail',
                component: NotificationNotificationHistoryDetail
            },

            {
                path: '/notifications/notificationLists',
                name: 'NotificationListView',
                component: NotificationListView
            },
            {
                path: '/notifications/notificationLists/:id',
                name: 'NotificationListViewDetail',
                component: NotificationListViewDetail
            },
            {
                path: '/phones/phones',
                name: 'PhonePhoneManager',
                component: PhonePhoneManager
            },
            {
                path: '/phones/phones/:id',
                name: 'PhonePhoneDetail',
                component: PhonePhoneDetail
            },

            {
                path: '/phones/searchPhones',
                name: 'SearchPhoneView',
                component: SearchPhoneView
            },
            {
                path: '/phones/searchPhones/:id',
                name: 'SearchPhoneViewDetail',
                component: SearchPhoneViewDetail
            },


    ]
})
