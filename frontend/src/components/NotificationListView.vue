<template>

    <v-data-table
        :headers="headers"
        :items="notificationList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'NotificationListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            notificationList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/notificationLists'))

            temp.data._embedded.notificationLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.notificationList = temp.data._embedded.notificationLists;
        },
        methods: {
        }
    }
</script>

