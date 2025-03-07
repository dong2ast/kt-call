<template>

    <v-card outlined>
        <v-card-title>
            SearchPhone # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Owner" v-model="item.owner" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PhoneNumber" v-model="item.phoneNumber" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UsimStatus" v-model="item.usimStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ImeiStatus" v-model="item.imeiStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'SearchPhoneViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/searchPhones/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

