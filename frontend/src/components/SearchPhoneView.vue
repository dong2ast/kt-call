<template>

    <v-data-table
        :headers="headers"
        :items="searchPhone"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchPhoneView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "owner", value: "owner" },
                { text: "phoneNumber", value: "phoneNumber" },
                { text: "usimStatus", value: "usimStatus" },
                { text: "imeiStatus", value: "imeiStatus" },
            ],
            searchPhone : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchPhones'))

            temp.data._embedded.searchPhones.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchPhone = temp.data._embedded.searchPhones;
        },
        methods: {
        }
    }
</script>

