#!/usr/bin/env python
# Licensed to Cloudera, Inc. under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  Cloudera, Inc. licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import logging

from django.utils.translation import ugettext as _

from liboozie.oozie_api import get_oozie

from jobbrowser.apis.base_api import Api


LOG = logging.getLogger(__name__)


try:
  from oozie.conf import OOZIE_JOBS_COUNT
except Exception, e:
  LOG.exception('Some application are not enabled: %s' % e)


class ScheduleApi(Api):

  def apps(self):
    oozie_api = get_oozie(self.user)
    kwargs = {'cnt': OOZIE_JOBS_COUNT.get(), 'filters': []}
    wf_list = oozie_api.get_coordinators(**kwargs)

    return [{'id': app.id, 'status': app.status} for app in wf_list.jobs]

  def app(self, appid):
    oozie_api = get_oozie(self.user)
    workflow = oozie_api.get_coordinator(jobid=appid)

    return {'id': workflow.coordJobId, 'name': workflow.coordJobName, 'status': workflow.status}
