<template>

    <v-card outlined>
        <v-card-title>
            ReportDetail # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Name" v-model="item.name" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PhoneNumber" v-model="item.phoneNumber" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Reason" v-model="item.reason" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Usim" v-model="item.usim" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Imei" v-model="item.imei" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ReportDetailViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/reportDetails/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

