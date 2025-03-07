<template>

    <v-card outlined>
        <v-card-title>
            NotificationList # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Titled" v-model="item.titled" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Description" v-model="item.description" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="From" v-model="item.from" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'NotificationListViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/notificationLists/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

