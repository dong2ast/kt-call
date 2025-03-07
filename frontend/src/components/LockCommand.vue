<template>
    <v-card outlined>
        <v-card-title>
            Lock
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <String label="PhoneNumber" v-model="value.phoneNumber" :editMode="editMode"/>
            <String label="Reason" v-model="value.reason" :editMode="editMode"/>
            <String label="Usim" v-model="value.usim" :editMode="editMode"/>
            <String label="Imei" v-model="value.imei" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="lock"
            >
                Lock
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'LockCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.name = '';
            this.value.phoneNumber = '';
            this.value.reason = '';
            this.value.usim = '';
            this.value.imei = '';
        },
        watch: {
        },
        methods: {
            lock() {
                this.$emit('lock', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

