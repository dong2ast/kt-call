<template>

    <v-data-table
        :headers="headers"
        :items="reportDetail"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ReportDetailView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "name", value: "name" },
                { text: "phoneNumber", value: "phoneNumber" },
                { text: "reason", value: "reason" },
                { text: "usim", value: "usim" },
                { text: "imei", value: "imei" },
            ],
            reportDetail : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/reportDetails'))

            temp.data._embedded.reportDetails.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.reportDetail = temp.data._embedded.reportDetails;
        },
        methods: {
        }
    }
</script>

